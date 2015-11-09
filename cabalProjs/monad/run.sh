#!/bin/sh

ghc -O2 --make -threaded $1.hs -prof -auto-all -caf-all -fforce-recomp -rtsopts
time ./$1 +RTS -h -p -K400M -sstderr
hp2ps -e8in -c $1.hp
gnome-open $1.ps
rm *.o *.hi *aux
