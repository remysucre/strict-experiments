import System.Environment
import Data.List

bitv :: String -> [Double]
bitv f = map (read . last) rows
  where rows = map words $ stripEmpty $ init $ drop 7 $ lines f

stripEmpty = filter (/= "")

main = do
  [fp] <- getArgs
  fc <- readFile fp
  putStr $ unlines $ map show $ map (1/) (bitv fc)
