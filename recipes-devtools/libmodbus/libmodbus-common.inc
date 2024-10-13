

DESCRIPTION = "Recipe for libmodbus library"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"
SRC_URI = "git://github.com/stephane/libmodbus.git;protocol=https"

S = "${WORKDIR}/git"

inherit autotools

EXTRA_OECONF = "--prefix=/usr --host=arm-poky-linux-gnueabi"

