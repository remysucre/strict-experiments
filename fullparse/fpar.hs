import System.Environment
import Data.List

bitv :: String -> [Double]
bitv f = map (read . last) rows
  where rows = map words $ drop 3 $ lines f

timev = sort . bitv

main = do
  [fp] <- getArgs
  fc <- readFile fp
  putStr $ unlines $ map show (timev fc)
