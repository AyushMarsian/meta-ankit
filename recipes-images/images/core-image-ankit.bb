

SUMMARY = "Test image file duplicate of core-image-minimal"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "CLOSED"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"

IMAGE_INSTALL:append = "	\
		libmodbus	\
		mbpoll		\
		helloc-c	\
		helloc-cpp	\
		hellocmake	\
                hellocpp	\
		hellomake	\
		helloconf 	\
"


