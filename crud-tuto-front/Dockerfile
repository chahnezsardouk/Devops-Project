#FROM nginx:alpine
#COPY dist/crudtuto-Front /usr/share/nginx/html
#EXPOSE 4200:80



#FROM node:latest as build
#WORKDIR /usr/local/app
#COPY ./ /usr/local/app/
#RUN npm install
#RUN npm run build

FROM nginx:alpine
COPY --from=node /usr/local/app/dist /usr/share/nginx/html
EXPOSE 4200:80


#FROM johnpapa/angular-cli as angular-built
#WORKDIR /usr/src/app
#COPY package.json package.json
#RUN npm install --silent
#COPY . .
#RUN ng build --prod
#
#FROM nginx:alpine
#LABEL author="Preston Lamb"
#COPY --from=angular-built /usr/src/app/dist/crudtuto-Front /usr/share/nginx/html
#EXPOSE 80 443
#CMD [ "nginx", "-g", "daemon off;" ]
