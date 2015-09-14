set title "gene search sorted by 1/score, length"
set ylabel "1/time in seconds"
set xlabel "genes in original order"
plot 'lengthover.data' using 1 with points
