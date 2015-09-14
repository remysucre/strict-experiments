set terminal pdf
set output 'out.pdf'
set title "gene search sorted by 1/score, sumacc"
set ylabel "1/time in seconds"
set xlabel "genes in original order"
plot 'sumaccover.data' using 1 with points
