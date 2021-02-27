import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-buscar-producto`
 *
 * VistaBuscarProducto element.
 *
 * @customElement
 * @polymer
 */
class VistaBuscarProducto extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-buscar-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscarProducto.is, VistaBuscarProducto);
