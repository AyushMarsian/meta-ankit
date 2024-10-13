FILESEXTRAPATHS:prepend := "${THISDIR}/files/:"

SRC_URI:append = " file://world.cpp"

do_compile:append(){

	${CXX} ${CXXFLAGS} ${LDFLAGS} world.cpp -o worldcpp

}

do_install:append(){

	install -m 777 ${S}/worldcpp ${D}/usr/bin
}

INSANE_SKIP:${PN} = "installed-vs-shipped"

PACKAGES = " ${PN}-c ${PN}-cpp"

FILES:${PN}-c = " /usr/bin/helloc"
FILES:${PN}-cpp = " /usr/bin/worldcpp"
