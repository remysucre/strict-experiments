set title 'monad'
set terminal pdf
set output 'out.pdf'
set ylabel "time in seconds"
set xlabel "unordered genes"
plot 'monad4.dat' using 1 with linespoints
