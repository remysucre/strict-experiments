set title 'thread'
set terminal pdf
set output 'out.pdf'
set ylabel "time in seconds"
set xlabel "unordered genes"
plot 'thread4.dat' using 1 with linespoints
