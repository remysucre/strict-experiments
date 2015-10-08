
function crop ()
{
  for file in ./*
  do
    pdfcrop $file;
  done
}

for dir in ./*;
  do
    (cd $dir; cd profile; rm !(*join*));
  done
