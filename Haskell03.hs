---exe 1
crescente [] = True
crescente [x] = True
crescente (x:y:xs) | x<y = crescente (y:xs)
                   | otherwise = False


---exe 2
i = 0
indice:: Int -> [Int] -> Int
indice n (x:xs) | x == n = let numeros [] (x:xs !! i):numeros
                | otherwise = i = i+1 indice n (xs)

---exe 3
strUpper:: [Char] -> [Char]
strUpper (x:xs) = let ret [] toUpper(x):ret strUpper xs

---exe 4
j = 0
conta:: Char -> [Char] -> Int
conta l (x:xs) | l==x = x:xs !! j
               | otherwise = j = j+1 conta xs
---exe 5
divisores :: Int -> [Int]
divisores n = [x | x <- [1..n], n `mod` x == 0]
primo :: Int -> Bool
primo n = divisores n == [1,n]

main = do
  putStrLn "Hello"

