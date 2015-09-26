stats 'fibwbitln' using 3 nooutput
unset key
set style data points
plot for [i=STATS_min:STATS_max] 'fibwbitln' using 2:($3 == i ? $1 : 1/0) lt 1 pt i ps 2
