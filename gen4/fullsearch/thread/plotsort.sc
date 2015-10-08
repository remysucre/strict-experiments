set terminal pdf
set output 'out.pdf'
set title "full search sorted by time, thread"
set ylabel "time in seconds"
set xlabel "unordered genes"
plot 'threadsort.data' using 1 with lines
