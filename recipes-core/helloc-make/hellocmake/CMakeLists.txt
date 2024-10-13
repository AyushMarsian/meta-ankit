# Specify the minimum version of CMake
cmake_minimum_required(VERSION 3.10)

# Set the project name
project(HelloCpp)

# Specify the C++ standard
set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

# Use the ${CXX} variable to define the compiler explicitly
#set(CMAKE_CXX_COMPILER ${CXX})

# Add the executable
add_executable(hellocmake hellocpp.cpp)


target_compile_options(hellocmake PRIVATE ${LDFLAGS} ${CXXFLAGS})

install(TARGETS hellocmake DESTINATION /usr/bin)
