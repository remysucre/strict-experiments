set title "full search sorted by 1/time, fib"
set ylabel "1/time in seconds"
set xlabel "unordered genes"
plot 'fibover.data' using 1 with lines
