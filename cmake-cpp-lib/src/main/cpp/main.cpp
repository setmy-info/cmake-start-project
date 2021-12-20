#include "Application.h"

using namespace HAS;

int main(int argc, char *argv[], char *env[]) {
    Application app;
    return app.Args(argc, argv, env);
}
