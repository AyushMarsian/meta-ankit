
DESCRIPTION = "Recipe for mbpoll application"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "cmake-native libmodbus"

do_compile(){
	cd ${S}
        install -d build
        cd build
        cmake ..
	make
}

do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/build/mbpoll ${D}/usr/bin
}


