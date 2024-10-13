
DESCRIPTION = "Auto tools trial bb file"
LICENSE = "CLOSED"
SRC_URI = "			\
	file://helloconf.c	\
	file://configure.ac	\
	file://autogen.sh	\
	file://Makefile.am	\
"

S = "${WORKDIR}"

inherit autotools

