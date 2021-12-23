#!/bin/sh

CUR_DIR=$(pwd)

generateList() {
    cd ../../../target/lib
    FILE_LIST=$(ls)
    for var in ${FILE_LIST}; do
        echo "INSTALL(FILES \"\${MAN_OUTPUT_PATH}/target/lib/${var}\" DESTINATION lib)"
    done
    return
}

runCommands() {
    generateList
    cd ${CUR_DIR}
    return
}

runCommands

exit 0
