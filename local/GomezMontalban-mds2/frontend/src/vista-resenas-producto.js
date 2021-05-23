import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-resenas-producto`
 *
 * VistaResenasProducto element.
 *
 * @customElement
 * @polymer
 */
class VistaResenasProducto extends PolymerElement {

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
        return 'vista-resenas-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaResenasProducto.is, VistaResenasProducto);
