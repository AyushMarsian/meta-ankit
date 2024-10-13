DESCRIPTION="Recipe for hello c example using make file"
LICENSE="CLOSED"

SRC_URI="file://hellocpp.cpp \
	 file://CMakeLists.txt"

S="${WORKDIR}"

#INSANE_SKIP:${PN} = "installed-vs-shipped"

inherit cmake
