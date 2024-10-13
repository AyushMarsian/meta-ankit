DESCRIPTION="Recipe for hello c example using make file"
LICENSE="CLOSED"

SRC_URI="file://hellocpp.cpp \
	 file://CMakeLists.txt"

S="${WORKDIR}"

# Add CMake as a dependency
DEPENDS = "cmake-native"

do_compile(){
        cd ${S}
        mkdir build
        cd build
        cmake ..
        make
}

do_install(){
        install -d ${D}/usr/bin
        install -m 777 ${S}/build/hellocmake ${D}/usr/bin

}
