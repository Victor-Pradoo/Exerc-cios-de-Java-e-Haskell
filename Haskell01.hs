concatenar :: [[a]] -> [a]
concatenar [] = []
concatenar (x:xs) = x ++ concatenar xs

somar :: [Int] -> Int
somar [] = 0
somar (x:xs) = x + somar xs

contem :: [Int] -> Int -> Bool
contem [] _= False
contem (x:xs) y | x == y = True --- | é uma codiçã
                | otherwise = contem xs y

obter :: Int -> [Int] -> [Int]
obter 0 _= []
obter _[] = []
obter n (x:xs) = [x] ++ obter (n-1) xs

concatena :: [[Int]] -> [Int]
concatena xss = [x | xs <- xss, x <- xs]

crescente [] = True
crescente [x] = True
crescente (x:y:xs) | x<y = crescente (y:xs) --- aqui comparo x com y e na recursão substituo o x:y por y:xs sendo xs a lista -1 elemento
                   | otherwise = False

main = do
  putStrLn "Hello"
  putStrLn "World"
