set terminal pdf
set output 'out.pdf'
set title "full search sorted by time, length"
set ylabel "time in seconds"
set xlabel "unordered genes"
plot 'lengthsort.data' using 1 with linespoints
