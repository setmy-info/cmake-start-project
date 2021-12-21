cmake_minimum_required (VERSION 3.22.1)

# PLACEHOLDER-BEGIN #

PROJECT (setmy-info-scripts)

SET (PROJECT_VERSION_MAJOR              0)
SET (PROJECT_VERSION_MINOR              1)
SET (PROJECT_VERSION_PATCH              0)
SET (PROJECT_VERSION_TWEAK              0)

SET (PROJECT_DESCRIPTION_SUMMARY        "setmy.info C++ project")
SET (PROJECT_DESCRIPTION                "setmy.info C++ project Example")
SET (PROJECT_VENDOR                     "Hear And See Systems LLC")
SET (PROJECT_MAINTAINER                 "Imre Tabur <imre.tabur@eesti.ee>")
SET (PROJECT_WWW                        "https://setmy.info")
SET (PROJECT_LICENSE                    "MIT")

INCLUDE(./src/main/resources/cmake/variables.txt)
INCLUDE(./src/main/resources/cmake/targets.txt)
INCLUDE(./src/main/resources/cmake/dependencies.txt)
INCLUDE(./src/main/resources/cmake/configure.txt)
INCLUDE(./src/main/resources/cmake/lib.txt)
INCLUDE(./src/main/resources/cmake/bin.txt)
INCLUDE(./src/main/resources/cmake/man.txt)
INCLUDE(./src/main/resources/cmake/etc.txt)

# PLACEHOLDER-PRE-PACKAGING #

INCLUDE(./src/main/resources/cmake/packaging.txt)

# PLACEHOLDER-END #
