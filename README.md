# cmake-start-project

## TODO

1. RPM building fails

```
CPack Error: Error while execution CPackRPM.cmake
CPack Error: Problem compressing the directory
CPack Error: Error when generating package: cmake-cpp-lib
```
2. JNI testing in maven tests doesn't work with surefire and failsafe

3. Java compiles also class file, but only .h file is needed.

4. FreeBSD valgrind shows memory leaks even for empty main file. But it looks constatn in any non leaking case.

5. Add boost test library.

## Development

```sh
cd cmake-cpp-lib
./configure [Release|Debug|CI]
make
make package
cd ..
export LD_LIBRARY_PATH=$(pwd)/cmake-cpp-lib/target/debug/lib
cd cmake-java-lib
mvn clean install
mvn exec:java
```

### Preparations

```sh
sudo dnf -y install doxygen cppcheck graphviz valgrind libmicrohttpd json-c-devel libmicrohttpd-devel boost-test kdbg
```
