set title "gene search sorted by 1/score, fib"
set ylabel "1/time in seconds"
set xlabel "genes in original order"
plot 'fibover.data' using 1 with points
