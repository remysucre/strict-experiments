set terminal pdf
set output 'out.pdf'
set title "full search sorted by 1/time, length"
set ylabel "1/time in seconds"
set xlabel "unordered genes"
plot 'lengthsort.data' using 1 with lines
