import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-ver-ficha.js';

class VistaProductoAEnviar extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vista-ver-ficha id="vistaVerFicha"></vista-ver-ficha>
`;
    }

    static get is() {
        return 'vista-producto-a-enviar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoAEnviar.is, VistaProductoAEnviar);
