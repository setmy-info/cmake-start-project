/**
 * File:   Application.cpp
 * Author: Imre Tabur
 * 
 */
#include "Application.h"
#include "Version.h"

#include <cstdio>
#include <cmath>
#include <cstdlib>

#include <iostream>

void workerFunc();

namespace HAS {

    Application::Application() {
        // Ready for write.
    }

    Application::Application(const Application& orig) {
        // Ready for write.
    }

    Application::~Application() {
        // Ready for write.
    }

    int Application::Args(int argc, char *argv[], char *env[]) {
        this->commandName = argv[0];
        for (int i = 1; i < argc; i++) {
            std::string tmp = argv[i];
            this->parameters.push_back(tmp);
        }
        if (argc < 2) {
            fprintf(stdout, "%s Version %d.%d\n",
                    argv[0],
                    PROJECT_MODULE_VERSION_MAJOR,
                    PROJECT_MODULE_VERSION_MINOR);
            fprintf(stdout, "Usage: %s number\n", argv[0]);
            return 1;
        }
        double inputValue = atof(argv[1]);
        double outputValue = sqrt(inputValue);
        fprintf(stdout, "The square root of %g is %g\n", inputValue, outputValue);
        return this->Main();
    }

    int Application::Main() {
        std::cout << "main: startup" << std::endl;

        std::cout << "main: done" << std::endl;
        return 0;
    }
}
