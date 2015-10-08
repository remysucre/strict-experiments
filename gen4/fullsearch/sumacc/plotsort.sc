set terminal pdf
set output 'out.pdf'
set title "full search sorted by time, sumacc"
set ylabel "time in seconds"
set xlabel "unordered genes"
plot 'sumaccsort.data' using 1 with linespoints
