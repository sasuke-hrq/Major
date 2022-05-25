#!/bin/sh

$MAJOR_HOME/bin/mmlc mml/triangle1.mml mml/triangle1.mml.bin
$MAJOR_HOME/bin/mmlc mml/triangle2.mml mml/triangle2.mml.bin

$MAJOR_HOME/bin/ant -DmutOp="=mml/triangle1.mml.bin" clean compile
$MAJOR_HOME/bin/ant -DmutOp="=mml/triangle2.mml.bin" clean compile

$MAJOR_HOME/bin/ant compile.tests

$MAJOR_HOME/bin/ant test

$MAJOR_HOME/bin/ant mutation.test

