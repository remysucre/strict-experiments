
function crop ()
{
  for file in ./*
  do
    pdfcrop $file; pdfjoin *crop*
  done
}

for dir in ./*;
  do
    (cd $dir; cd profile; crop);
  done
