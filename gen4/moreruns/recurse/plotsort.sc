set title 'recurse'
set terminal pdf
set output 'out.pdf'
set ylabel "time in seconds"
set xlabel "unordered genes"
plot 'recurse4.dat' using 1 with linespoints
