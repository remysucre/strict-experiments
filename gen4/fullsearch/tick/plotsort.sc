set terminal pdf
set output 'out.pdf'
set title "full search sorted by time, tick"
set ylabel "time in seconds"
set xlabel "unordered genes"
plot 'ticksort.data' using 1 with lines
