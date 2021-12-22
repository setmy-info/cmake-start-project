#!/bin/sh

#For example

genKeyStore() {
    keytool -genkey -keystore myKeystore -alias myself -keypass password -storepass password -keyalg RSA -validity 365 -dname "CN=Moon Shine, OU=Development, O=some.org"
    keytool -selfcert -alias myself -keystore myKeystore
    keytool -list -keystore myKeystore
    return
}

genKeyStore
#jarsigner -keystore myKeystore ./cmake-java-lib-1.0.0.jar myself

exit 0
