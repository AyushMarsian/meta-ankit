DESCRIPTION="Recipe for hello c example"
LICENSE="CLOSED"

SRC_URI="file://hello.c \
"

S="${WORKDIR}"

do_compile(){
        cd ${S}
        ${CC} ${LDFLAGS} hello.c -o helloc
}

do_install(){
        install -d ${D}/usr/bin
        install -m 777 ${S}/helloc ${D}/usr/bin

}


