import System.Environment
import Data.List

oneover :: String -> String
oneover ls = unlines $ map show ns
  where ns = map (1 /) ns0
        ns0 = map read $ lines ls

main = do
  [fp] <- getArgs
  fc <- readFile fp
  putStr $ oneover fc
