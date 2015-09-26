import System.Environment
import Data.List

numberl :: String -> String
numberl fc = unlines numbered
  where numbered = zipWith (++) (map ((++ " ") . show) [1..]) ls
        ls = lines fc

main = do
  [fp] <- getArgs
  fc <- readFile fp
  putStr $ numberl fc
