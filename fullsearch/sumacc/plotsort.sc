set title "full search sorted by 1/time, sumacc"
set ylabel "1/time in seconds"
set xlabel "unordered genes"
plot 'sumaccover.data' using 1 with lines
