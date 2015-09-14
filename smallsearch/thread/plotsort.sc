set title "gene search sorted by 1/score, thread"
set ylabel "1/time in seconds"
set xlabel "genes in original order"
plot 'threadover.data' using 1 with points
