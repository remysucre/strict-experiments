set title "full search sorted by 1/time, thread"
set ylabel "1/time in seconds"
set xlabel "unordered genes"
plot 'threadover.data' using 1 with lines
