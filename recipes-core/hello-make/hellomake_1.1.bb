DESCRIPTION="Recipe for hello c example using make file"
LICENSE="CLOSED"

SRC_URI="file://hellomake.c \
	 file://Makefile"

S="${WORKDIR}"

inherit base

do_install(){
	oe_runmake install DESTDIR=${D}
}
