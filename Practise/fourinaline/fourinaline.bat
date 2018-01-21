#!/bin/bash 
MAINCLASS="fourinaline.Main"
CP="build/classes"
java -cp "${CP}" ${MAINCLASS} "$*"