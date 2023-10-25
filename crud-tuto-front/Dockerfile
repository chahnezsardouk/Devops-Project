#FROM nginx:alpine
#COPY ./src/index.html /usr/share/nginx/html
#EXPOSE 4200:80

FROM node:12 AS build
WORKDIR /app
COPY package*.json ./
RUN npm install -f
COPY . .
RUN npm run build
FROM nginx:1.21.1
COPY --from=build /app/dist/crudtuto-Front /usr/share/nginx.html
EXPOSE 4200
CMD ["nginx", "-g", "daemon off;"]

