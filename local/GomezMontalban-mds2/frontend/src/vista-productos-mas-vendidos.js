import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-filtrar-por-categoria.js';

class VistaProductosMasVendidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <vista-filtrar-por-categoria style="align-self: center;"></vista-filtrar-por-categoria>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productos-mas-vendidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosMasVendidos.is, VistaProductosMasVendidos);
