set title "gene search sorted by 1/score, tick"
set ylabel "1/time in seconds"
set xlabel "genes in original order"
plot 'ticksmall.data' using 1 with points
