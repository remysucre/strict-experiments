set title "gene search sorted by 1/score, recurse"
set ylabel "1/time in seconds"
set xlabel "genes in original order"
plot 'recurseover.data' using 1 with points
