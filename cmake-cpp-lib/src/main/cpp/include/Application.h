/**
 * File:   Application.h
 * Author: Imre Tabur
 *
 */

#ifndef APPLICATION_H
#define	APPLICATION_H

#include <string>
#include <vector>
#include <map>

namespace HAS {

    class Application {
    public:

        std::string commandName;
        std::vector<std::string> parameters;

        Application();
        Application(const Application& orig);
        virtual ~Application();

        int Args(int argc, char *argv[], char *env[]);
        virtual int Main();

    private:

    };
}
#endif
