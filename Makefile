
all:
	javac letras.java

run: all
	java letras

.PHONY: clean

clean:
	rm -f *.class