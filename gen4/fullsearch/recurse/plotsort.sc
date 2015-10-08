set terminal pdf
set output 'out.pdf'
set title "full search sorted by time, recurse"
set ylabel "time in seconds"
set xlabel "unordered genes"
plot 'recursesort.data' using 1 with linespoints
