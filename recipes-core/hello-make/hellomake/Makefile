# Target executable
TARGET = hellomake

# Source files
SRCS = hellomake.c

# Object files
OBJS = $(SRCS:.c=.o)

# Default target
all: $(TARGET)

# Link the object files to create the executable
$(TARGET): $(OBJS)
	$(CC) $(LDFLAGS) $(OBJS) -o $(TARGET)

# Compile source files to object files
.c.o:
	$(CC) -c $< -o $@

# Clean up generated files
clean:
	rm -f $(OBJS) $(TARGET)

install:
	install -d ${DESTDIR}/usr/bin
	install -m 0755 $(TARGET) ${DESTDIR}/usr/bin

# Phony targets
.PHONY: all clean
